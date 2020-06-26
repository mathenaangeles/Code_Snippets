# Remove the 0X or X in the hex value.
def clean(color):
    if len(color) > 3:
        color = color.replace("0X", "")
    else:
        color = color.replace("X", "")
    return color

# Get the corresponding hex value of any given red, green, or blue value.


def get_hex(color):
    if color > 255:
        return "FF"
    else:
        return str(hex(color)).upper()

# Convert RGB to Hex.


def rgb(r, g, b):
    red = get_hex(r)
    red = clean(red)
    green = get_hex(g)
    green = clean(green)
    blue = get_hex(b)
    blue = clean(blue)
    hexadecimal = "#" + red + green + blue
    return hexadecimal


print(rgb(255, 255, 255))
print(rgb(255, 255, 300))
print(rgb(0, 0, 0))
print(rgb(148, 0, 211))
