#!/usr/bin/python
def addition(filename):
        """
        Adds two matrices.

        Args:
                c = list containing the sum of corresponding elements
        Returns:
                The sum of the two matrices

        """
	with open(filename, 'r') as file:
		matrix=file.read().split()
		a=matrix[0].split()
		b=matrix[1].split()
	a=eval(a[0])
	b=eval(b[0])
	if len(a[0])==len(b[0]) and len(a)==len(b):
		sum = []
		for i in range(len(a)):
			c = []
			for j in range(len(a[0])):
				c.append(a[i][j]+b[i][j])
			sum.append(c)
		return sum
	else:
		print ('Error')

def multiplication(filename):
        """
        Multiply two matrices.

        Args:
                row_a = the number of rows in a
                row_b = the number of rows in b
                col_a = the number columns in a
                col_b = the number of columns in b
        Returns:
                The product of the two matrices

        """
	with open(filename, 'r') as myfile:
		data=myfile.read().split()
		a=data[0].split()
		b=data[1].split()
	a=eval(a[0])
	b=eval(b[0])
	row_a=len(a)
	row_b=len(b)
	col_a=len(a[0])
	col_b=len(b[0])
	if col_a!=row_b:
		print ('Error')
	else:
		c=[[0 for row in range(col_b)] for col in range(row_a)]
		for i in range (row_a):
			for j in range (col_b):
				for k in range (col_a):
					c[i][j]+=a[i][k]*b[k][j]
		return c

def augment(filename):
        """
        Combine two matrices.

        Args:
                augment = the first matrix
                b = the second matrix
        Returns:
                A single matrix that consists of the two matrices put together

        """
        with open(filename, 'r') as myfile:
                data = myfile.read().split()
        augment = eval(data[0])
        b = eval(data[1])
        if len(augment) != len(b):
            print('Error')
            return None
        for i, l in enumerate(augment):
            l.extend(b[i])
        return augment

def identity(filename):
        """
        Create an indentity matrix with the given dimensions.

        Args:
                row = number of rows
                col = number of columns
                val = the value of each element in the identity matrix
        Returns:
                An identity matrix with the specified dimensions

        """
	with open(filename, 'r') as myfile:
		row,col=myfile.read().split(',')
		row=int(row)
		col=int(col)
	identity = []
	for i in range(row):
		val = [0]*row
		val[i] = 1
		identity.append(val)
	return identity

def zeroes(filename):
        """
        Create a matrix of zeroes with the given dimensions.

        Args:
                row = number of rows
                col = number of columns
                zeroes2 = list of zeroes
        Returns:
                An zero matrix with the specified dimensions

        """
	with open(filename, 'r') as myfile:
		row,col=myfile.read().split(',')
		row=int(row)
		col=int(col)
	zeroes=[]
	for i in range (row):
		zeroes2=[]
		for j in range (col):
			zeroes2.append(0)
		zeroes.append(zeroes2)
	return zeroes

def ones(filename):
        """
        Create a matrix of ones with the given dimensions.

        Args:
                row = number of rows
                col = number of columns
                ones2 = list of ones
        Returns:
                An matrix of ones with the specified dimensions

        """
	with open(filename, 'r') as myfile:
		row,col=myfile.read().split(',')
		row=int(row)
		col=int(col)
	ones=[]
	for i in range (row):
		ones2=[]
		for j in range (col):
			ones2.append(1)
		ones.append(ones2)
	return ones

def diagonal(filename):
        """
        Give the matrix wherein all entries outside the main diagonal are zero.

        Args:
                c = number of columns
                d = number of rows
        Returns:
                The diagonal of a matrix

        """
	with open(filename, 'r') as myfile:
		data=myfile.read().split()
		a=data[0].split()
	a=eval(a[0])
	c=len(a[0])
	d=len(a)
	if c==d:
		diagonal=[[a[i][i] if i == j else 0 for j in range(len(k))]
			for i, k in enumerate(a)]
		return diagonal
	else:
		return ('Error')

def transpose(filename):
        """
        Interchange the rows and columns of a matrix.

        Args:
                c = number of columns
                d = number of rows
        Returns:
                The transposed version of the matrix

        """
	with open(filename, 'r') as myfile:
		data=myfile.read().split()
		a=data[0].split()
	a=eval(a[0])
	c=len(a[0])
	d=len(a)
	transpose = [[a[j][i] for j in range (d)] for i in range (c)]
	return transpose
