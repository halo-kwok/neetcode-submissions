class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # dynamic arrays for each sublist
        # traverse the list. if combination of letters exist in hashmap, add to sublist.
        # one sublist made per traversal
        # break each element into respective letters
        letter_combos = dict()
        for str in strs:
            key = "".join(sorted(str))
            if key not in letter_combos:
                letter_combos[key] = []
            letter_combos[key].append(str)

        return list(letter_combos.values())