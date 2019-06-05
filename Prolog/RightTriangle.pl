% Draws a Right Triangle with a Height of N
drawTriangle:-
    write('Height:'),
    read(X),
    triangle(0,X).

triangle(Y,X):-
    Y<X,
    count(0,Y),
    Z = Y+1,
    triangle(Z,X).
triangle(Y,X):-Y>=X.
count(X,Y):-
    X=<Y,
    write('*'),
    Z = X+1,
    count(Z,Y).
count(X,Y):-X>Y,nl.
