public class Set {

	private LinkedNode head;

	public Set() {
		head = null;
	}

	public void add(int x) {

		if (!exists(x)) {
			LinkedNode node = new LinkedNode(x);
			node.setNext(head);
			head = node;
		}
	}

	public void delete(int x) {
		if (head != null) {
			if (head.getData() == x) {
				head = head.getNext();
			} else {
				LinkedNode temp = head;
				while (temp.getNext() != null) {
					if (temp.getNext().getData() == x) {
						temp.setNext(temp.getNext().getNext());
						break;
					}
					temp = temp.getNext();
				}
			}
		}
	}

	public boolean exists(int x) {
		LinkedNode temp = head;
		while (temp != null) {
			if (temp.getData() == x) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	public String toString() {
		String data = "";
		LinkedNode temp = head;
		while (temp != null) {
			data += temp.getData() + " ";
			temp = temp.getNext();
		}
		return data;
	}
}
