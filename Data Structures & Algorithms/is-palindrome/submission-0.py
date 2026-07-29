class Solution:
    def isPalindrome(self, s: str) -> bool:
        # ignores case
        s = s.lower()
        # gets rid of all non-alphanumeric characters
        cleaned_text = "".join(char for char in s if char.isalnum())
        reversedstr = ""
        length = len(cleaned_text)
        for i in range(length -1, -1, -1):
            reversedstr = reversedstr + cleaned_text[i:i+1]
        if cleaned_text == reversedstr: return True
        return False
            