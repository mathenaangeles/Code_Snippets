'''
INPUT: An Odd Number, n, That is the Width of the Middlemost Layer
OUTPUT: A Diamond Made of Smaller Diamonds of the Same Dimensions
'''
n = int(input('Enter an Odd Number:'))

if n%2 == 0:
	exit()

if n < 0:
	n = -n
	symbol = '$'
else:
	symbol = '+'

blockctr = 1
space = int((n-1)/2)
spaceblock = space * n
while blockctr <= n:


	linectr = 1
	spacectr = space
	while linectr <= n:
		print(' ' * spaceblock, end='')


		blockctr2 = 1
		while blockctr2 <= blockctr:
			print(' ' * spacectr, end='')
			print(symbol * linectr, end='')
			print(' ' * spacectr, end='')
			blockctr2 += 1

		print(' ' * spaceblock)
		linectr += 2
		spacectr -= 1


	linectr = n-2
	spacectr = 1
	while linectr >= 1:
		print(' ' * spaceblock, end='')

		blockctr2 = 1
		while blockctr2 <= blockctr:
			print(' ' * spacectr, end='')
			print(symbol * linectr, end='')
			print(' ' * spacectr, end='')
			blockctr2 += 1

		print(' ' * spaceblock)

		linectr -= 2
		spacectr += 1

	spaceblock -= n
	blockctr += 2


blockctr = n-2
spaceblock = n
while blockctr >= 1:


	linectr = 1
	spacectr = space
	while linectr <= n:
		print(' ' * spaceblock, end='')


		blockctr2 = 1
		while blockctr2 <= blockctr:
			print(' ' * spacectr, end='')
			print(symbol * linectr, end='')
			print(' ' * spacectr, end='')
			blockctr2 += 1

		print(' ' * spaceblock)
		linectr += 2
		spacectr -= 1


	linectr = n-2
	spacectr = 1
	while linectr >= 1:
		print(' ' * spaceblock, end='')

		blockctr2 = 1
		while blockctr2 <= blockctr:
			print(' ' * spacectr, end='')
			print(symbol * linectr, end='')
			print(' ' * spacectr, end='')
			blockctr2 += 1

		print(' ' * spaceblock)

		linectr -= 2
		spacectr += 1

	spaceblock += n
	blockctr -= 2
