class Solution(object):
    def toGoatLatin(self, S):
        """
        :type S: str
        :rtype: str
        """
        L = S.split(" ")
        result = []
        for i in range(len(L)):
            for j in range(len(L[i])):
                first = L[i][0]
                sentence = L[i]
                if first.lower() == "a" or first.lower() == "e" or first.lower() == "i" or first.lower() == "o" or first.lower() == "u":
                    sentence = sentence + "ma"
                else:
                    sentence = sentence.replace(first, "", 1) + first + "ma"
            result.append(sentence)

        result_str = ""
        for i in range(len(result)):
            result_str = result_str + " " + result[i] + "a" * (i + 1)

        return result_str.lstrip()


S = "I speak Goat Latin"
S = "The quick brown fox jumped over the lazy dog"
S = "zzGPuClvxA XYbNe"
solution = Solution()
print(solution.toGoatLatin(S))
