class Solution(object):
    def numUniqueEmails(self, emails):
        """
        :type emails: List[str]
        :rtype: int
        """
        result = []
        for i in range(0, len(emails)):
            if emails[i].find('+') != -1:
                local = emails[i].split('+')[0].replace('.', '')
            else:
                local = emails[i].split('@')[0].replace('.', '')
            domain = emails[i].split('@')[1]
            result.append(local + '@' + domain)
        return len(set(result))


emails = ["test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"]
# emails = ["test.email+alex@leetcode.com", "test.email@leetcode.com"]
solution = Solution()
print(solution.numUniqueEmails(emails))
