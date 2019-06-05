#include <iostream>
#include <fstream>
#include <cmath>

using namespace std;

class VEB {
    int u;
    int *m;
    int *M;
    VEB *summary;
    VEB **cluster;

public:
    VEB(int);
    int Min();
    int Max();
    int High(int);
    int Low(int);
    int Index(int, int);
    bool Member(int);
    void EmptyInsert(int);
    void Insert(int);
    void Delete(int);
    int* Predecessor(int);
    int* Successor(int);
    int ClosestNumber(int);
};

VEB::VEB(int size){
    int u = 2;
    while (u<size){
        u=u*u;
    }
    this -> u = u;
    this -> m = NULL;
    this -> M = NULL;

    if (u == 2){
        this -> summary = NULL;
        this -> cluster = NULL;
    } else {
        int subSize = High(u);
        this -> summary = new VEB(subSize);
        this -> cluster = new VEB*[subSize];
        for (int i=0;i<subSize;i++){
            cluster[i]=NULL;
        }

    }
}

int VEB::Min() {
    return (*m);
}

int VEB::Max() {
    return (*M);
}

int VEB::High(int x) {
    return (int)floor(x/sqrt(u));
}

int VEB::Low(int x) {
    return (int) (x % int(sqrt(u)));
}

int VEB::Index(int x, int y) {
    return (int) (x * floor(sqrt(u)) + y);
}

void VEB::EmptyInsert(int x){
    m = new int;
    M = new int;
    (*m) = (*M) = x;
}

void VEB::Insert(int x){
    if (m == NULL){
        EmptyInsert(x);
    } else {
        if (x<(*m)){
            int temp = x;
            x = (*m);
            (*m) = temp;
        }
        if (u>2){
            int high=High(x);
            if (cluster[high] == NULL){
                cluster[high] = new VEB(High(u));
            }
            if (summary==NULL){
                summary = new VEB(High(u));
            }
            if (cluster[high]->m == NULL){
                summary -> Insert(high);
                cluster[high] -> EmptyInsert(Low(x));
            } else {
                cluster[high] -> Insert(Low(x));
            }
        }
        if (x>(*M)){
            (*M) = x;
        }
    }
}

void VEB::Delete(int x){
    if ((*M) == (*m)){
        m = M = NULL;
    } else if (u == 2){
        if (x == 0){
            (*m) = 1;
        } else {
            (*m) = 0;
        }
        (*M) = (*m);
    } else {
        if (x == (*m)){
            x = Index (summary -> Min(), cluster[summary -> Min()]-> Min());
            (*m) = x;
        }
        cluster[High(x)] -> Delete(Low(x));
        if (cluster[High(x)] -> m == NULL){
            summary -> Delete(High(x));
            delete cluster[High(x)];
            if (x == (*M)){
                if (summary -> M == NULL) {
                    (*M) = (*m);
                } else {
                    (*M) = Index(summary -> Max(), cluster[summary -> Max()]-> Max());
                }
            }
        } else if (x == (*M)){
            (*M) = Index(High(x), cluster[High(x)]-> Max());
        }
    }

}


bool VEB::Member(int x){
    if (m == NULL){
        return false;
    } else if ((*m) == x || (*M) == x ){
        return true;
    } else if(x < (*m) || x > (*M)){
        return false;
    } else if (u<=2 || x==0) {
        return false;
    } else {
        if (cluster[High(x)] != NULL){
            return cluster[High(x)] -> Member(Low(x));
        } else {
            return false;
        }
    }
}

int* VEB::Predecessor(int x){
    if (u<=2){
        if (x == 1 && (*m) == 0){
            return 0;
        } else {
            return NULL;
        }
    } else if (M != NULL && (x>(*M)) ){
        return M;
    } else {
        if (m == NULL || x <= (*m)) {
            return NULL;
        }
        int *clusterMin = new int;
        int *offset = new int;
        int *final = new int;
        if (cluster[High(x)]!= NULL){
            clusterMin = cluster[High(x)] -> m;
        }
        if (clusterMin != NULL && Low(x)>(*clusterMin)){
            offset = cluster[High(x)] -> Predecessor(Low(x));
            if (offset != NULL){
                (*final) = Index(High(x), (*offset));
                return final;
            } else {
                (*final) = Index(High(x), 0);
                return final;
            }
        } else {
            int *newCluster = new int;
            if (summary != NULL){
                newCluster = summary -> Predecessor(High(x));
            }
            if (newCluster == NULL) {
                if ((m!=NULL) && x>(*m)){
                    return m;
                } else {
                    return NULL;
                }
            } else {
                if (cluster[(*newCluster)]!=NULL){
                    offset = cluster[(*newCluster)] -> M;
                }
                if (offset != NULL){
                    (*final) = Index((*newCluster),(*offset));
                    return final;
                } else {
                    (*final) = Index((*newCluster),0);
                    return final;
                }
            }
        }

    }
}

int* VEB::Successor(int x){
    if (u<=2){
        if (x == 0 && (*M) == 1){
            int *final = new int;
            (*final) = 1;
            return final;
        } else {
            return NULL;
        }
    } else if (m != NULL && x<(*m)){
        return m;
    } else {
        if (m == NULL || x >= (*M)) {
            return NULL;
        }
        int *clusterMax = new int;
        int *offset = new int;
        int *final = new int;
        if (cluster[High(x)]!=NULL){
            clusterMax = cluster[High(x)] -> M;
        }
        if (clusterMax!=NULL && Low(x)<(*clusterMax)){
            offset = cluster[High(x)] -> Successor(Low(x));
            if (offset!=NULL){
                (*final) = Index(High(x),(*offset));
                return final;
            } else {
                return NULL;
            }
        } else {
            int *newCluster = new int;
            if (summary!=NULL){
                newCluster = summary -> Successor(High(x));
            }
            if (newCluster == NULL){
                return NULL;
            } else {
                (*offset) = 0;
                if (cluster[(*newCluster)]!=NULL){
                    offset = cluster[(*newCluster)] -> m;
                }
                (*final) = Index((*newCluster),(*offset));
                return final;
            }
        }

    }

}

int VEB::ClosestNumber(int x){
    int predecessor;
    if (Predecessor(x)==NULL){
        predecessor=0;
    }else{
        predecessor=(*Predecessor(x));
    }
    //printf("Predecessor of %d is %d.\n",x,predecessor);
    int successor;
    if (Successor(x)==NULL){
        successor=0;
    }else{
        successor=(*Successor(x));
    }
    //printf("Successor of %d is %d.\n",x,successor);
    if (predecessor==0){
        if (successor==0){
            return 0;
        } else{
            return successor;
        }
    } else if (successor==0){
        return predecessor;
    } else{
        if((successor-x)<(x-predecessor)){
            return successor;
        } else {
            return predecessor;
        }
    }

}

int main(){

  VEB *VEB = new class VEB(8);
  VEB -> Insert(1);
  VEB -> Insert(2);
  VEB -> Insert(5);
  VEB -> Insert(6);
  VEB -> Insert(7);
  printf("%d\n", (*VEB -> Successor(2)));
  VEB -> Delete(2);
  printf("%d\n", (*VEB -> Predecessor(5)));
  return 0;
}
