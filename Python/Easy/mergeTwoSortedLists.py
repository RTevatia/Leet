class Node:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class MergeList:
    def list_merge(self, list1, list2):
        """
        if list1 and list2 are list
        """
        if not list1 and not list2:
            return []
        elif not list1 and list2:
            return list2
        elif list1 and not list2:
            return list1
        
        merged = []
        i, j = 0, 0

        while i < len(list2) and j < len(list2):
            if list1[i] < list2[j]:
                merged.append(list1[i])
                i += 1
            else:
                merged.append(list2[j])
                j += 1

        merged.extend(list1[i:])
        merged.extend(list2[j:])

        return merged
    
    def linkedList_merge(self, list1, list2):
        """
        If list1 and list2 are linkedlists.
        """
        if not list1 and not list2:
            return None
        elif not list1:
            return list2
        elif not list2:
            return list1
        
        merged_list = Node()
        current = merged_list

        while list1 and list2:
            if list1.val < list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next
            current = current.next

        # Attaching remianing part
        current.next = list1 if list1 else list2

        return merged_list.next

    def convert_list_to_linkedlist(self, input_list):
        if not input_list:
            return None
        
        head = Node(val=input_list[0])
        current = head

        for val in input_list[1:]:
            current.next = Node(val=val)
            current = current.next

        return head


    def convert_linkedlist_to_list(self, head):
        if not head:
            return []
        
        result = []
        current = head
        while current:
            result.append(current.val)
            current = current.next

        return result



def main():
    ml = MergeList()
    print("Merge using list method")
    print(f"Example 1: {ml.list_merge([1,2,4], [1,3,4])}")
    print(f"Example 2: {ml.list_merge([], [])}")
    print(f"Example 3: {ml.list_merge([], [0])}")

    print("\nMerge using linkedlist method")
    ll1 = ml.convert_list_to_linkedlist([1,2,4])
    ll2 = ml.convert_list_to_linkedlist([1,3,4])
    merge1 = ml.linkedList_merge(ll1, ll2)
    print(f"Example 1: {ml.convert_linkedlist_to_list(merge1)}")

    merge2 = ml.linkedList_merge(ml.convert_list_to_linkedlist([]), ml.convert_list_to_linkedlist([]))
    print(f"Example 1: {ml.convert_linkedlist_to_list(merge2)}")

    merge3 = ml.linkedList_merge(ml.convert_list_to_linkedlist([]), ml.convert_list_to_linkedlist([0]))
    print(f"Example 1: {ml.convert_linkedlist_to_list(merge3)}")

if __name__ == "__main__":
    main()