# "?" matches a single character
# "*" matches zero or more charcters

# examples:
# TRUE: ("*", "ab"), ("?a" ,"ba"), ("?a" ,"aa"), ("a*" ,"a")
# FALSE: ("*a", "ab"), ("?a" ,"baa"), ("?a" ,"a"), ("a*" ,"ba")

def isMatch(p,s):
    print(p,s) # print statemnt for debugging
# boundary cases of recursion
    if p == s:
        return True
    if p == "*":
        return True
    if p == "" or s == "":
        return False
# recursion case-1
    if p[0] == s[0] or p[0] == '?':
        return isMatch(p[1:], s[1:])
# recursion-case-2
    if p[0] == '*':
        return ( isMatch( p[1:], s) or isMatch( p, s[1:]))
# last case: if p[0] is a character
    if p[0] != s[0]:
        return False;

print(isMatch("*","ab"))

print(isMatch("?a" ,"baa"))

print(isMatch("a*" ,"ba"))