def swap_case(s):
    result = ""
    for character in s:
        if character.isupper() == True:
            result += (character.lower())
        elif character.isupper() == False:
            result += (character.upper())
    return result
