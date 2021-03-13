package kotlinversion

class Node(var data: Int) {

    var following: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var currently = this
        println(currently.data)
        while (currently.following != null) {
            currently = currently.following!!
            println(currently.data)
        }

    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        var counter = 0
        var currently = h
        if (h != null) {
            counter = 1
            while (currently?.following != null) {
                counter++
                currently = currently.following!!
            }
        }
        return counter
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var sum = 0
        var currently = this
        if (currently != null) {
            sum += currently.data
            while (currently.following != null) {
                currently = currently.following!!
                sum += currently.data
            }
        }
        return sum
    }

    fun deleteNode(head: Node, data: Int): Node? {
        val n: Node = head

        if (n.data == data) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data
        var currently = n
        while (currently.following != null) {
            if (currently.following!!.data == data) {
                if (currently.following!!.following != null) {
                    currently.following = currently.following!!.following!!
                    return head
                } else {
                    currently.following = null
                    return head
                }
            }
            currently = currently.following!!
        }

        //
        return head
    }
}