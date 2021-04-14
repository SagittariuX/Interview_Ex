// https://leetcode.com/problems/reorder-list/

var reorderList = function (head) {
  //find middle of list
  let slow = head;
  let fast = head;

  while (fast && fast.next) {
    slow = slow.next;
    fast = fast.next.next;
  }

  let secondHead = slow.next;
  slow.next = null;

  let temphead = secondHead;
  let prev = null;
  while (temphead) {
    let next = temphead.next;
    temphead.next = prev;
    prev = temphead;
    temphead = next;
  }

  secondHead = prev;

  let list1 = head;
  let list2 = secondHead;
  let temp = null;
  while (list1) {
    temp = list1.next;
    list1.next = list2;
    list1 = temp;
    temp = list2.next;
    list2.next = list1;
    list2 = temp;
  }

  return head;
};

// 1 2 3 4 5

// 1 2 3
// 4 5

// 1 2 3
// 5 4
