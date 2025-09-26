class Node {
    constructor(val = 0, next = null) {
        this.val = val
        this.next = next
    }
} 

class MergeList {
    listMerge(list1, list2) {
        if (!list1.length && !list2.length) return [];
        if (!list1.length) return list2;
        if (!list2.length) return list1;

        const merge = [];
        let i = 0, j = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                merge.push(list1[i]);
                i++;
            } else {
                merge.push(list2[j]);
                j++;
            }
        }

        return merge.concat(list1.slice(i)).concat(list2.slice(j));
    }

    linkedListMerge(list1, list2) {
        if (!list1 && !list2) return null;
        if (!list1) return list2;
        if (!list2) return list1;

        const dummy = new Node();
        let current = dummy;

        while (list1 && list2) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;

        }
        current.next = list1 || list2;
        return dummy.next;
    }

    convertListToLinkedList(inputList) {
        if (!inputList.length) return null;

        const head = new Node(inputList[0]);
        let current = head;

        for (let i = 1; i < inputList.length; i++) {
            current.next = new Node(inputList[i]);
            current = current.next;
        }
        return head;
    }

    convertLinkedListToList(head) {
        const result = [];
        let current = head;

        while (current) {
            result.push(current.val);
            current = current.next;
        }

        return result;
    }
}

function main() {
    const ml = new MergeList();

    console.log("Merge using list method");
    console.log("Example 1: ", ml.listMerge([1, 2, 3], [1, 3, 4]));
    console.log("Example 2: ", ml.listMerge([], []));
    console.log("Example 3: ", ml.listMerge([], [0]));

    console.log("\nMerge using linked list method")
    const ll1 = ml.convertListToLinkedList([1, 2, 3]);
    const ll2 = ml.convertListToLinkedList([1, 3, 4]);
    const merge1 = ml.linkedListMerge(ll1, ll2);
    console.log("Example 1: ", ml.convertLinkedListToList(merge1));

    const merge2 = ml.linkedListMerge(ml.convertListToLinkedList([]), ml.convertListToLinkedList([]));
    console.log("Example 2: ", ml.convertLinkedListToList(merge2));

    const merge3 = ml.linkedListMerge(ml.convertListToLinkedList([]), ml.convertListToLinkedList([0]));
    console.log("Example 3: ", ml.convertLinkedListToList(merge3))
}

main();