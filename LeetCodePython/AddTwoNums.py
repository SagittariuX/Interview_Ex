class ListNode:
    def __init__(self, value=0, next=None):
        self.value = value
        self.next = next


def addTwoNumbers(l1, l2):
    """
    :type l1: ListNode
    :type l2: ListNode
    :rtype: ListNode
    """

    head = ListNode((l1[0] + l2[0]) % 10)
    track = head
    carry = 1 if l1[0] + l2[0] > 9 else 0


    for i in range(1, min(len(l1) , len(l2))):
        next_value = l1[i] + l2[i] + carry
        carry = 1 if next_value > 9 else 0

        track.next = ListNode(next_value % 10)
        track = track.next


    if len(l1) != len(l2):
        more_list = l1 if len(l1) > len(l2) else l2
        fast_forward = len(l2) if len(l1) > len(l2) else len(l1)

        for i in range(fast_forward, len(more_list)):
            # print(i)
            next_value = more_list[i] + carry
            carry = 1 if next_value > 9 else 0

            track.next = ListNode(next_value % 10)
            track = track.next

    if carry == 1:
        track.next = ListNode(1)

    return head


head = addTwoNumbers([9,9,9,9,9,9,9] , [9,9,9,9])

while head != None:
    print(head.value)
    head = head.next