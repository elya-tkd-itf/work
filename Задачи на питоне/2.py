from turtle import *

def print_rect(n):
    colors = ["red", "green", "blue", "yellow"]
    for color in colors:
        pencolor(color)
        forward(n)
        right(90)

def spiral1():
    for i in range(200, 0, -1):
        print_rect(i)
        left(5)

def spiral2():
    for i in range(200):
        print_rect(i)
        left(10)

#spiral1()
spiral2()
done()