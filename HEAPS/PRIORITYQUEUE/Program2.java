import java.util.*;
class Solution{
	static class Student implements Comparable<Student>{
		String name;
		int rank;
		public Student(String name,int rank){
			this.name = name;
			this.rank = rank;
		}

		public int compareTo(Student s2){
			return this.rank - s2.rank;
		}
	}

	public static void main(String[] args){
		PriorityQueue <Student> pq = new PriorityQueue<>();
		pq.add(new Student("A",105));
		pq.add(new Student("D",107));
		pq.add(new Student("E",103));
		pq.add(new Student("B",108));
		pq.add(new Student("C",101));

		System.out.println(pq.peek().rank + " " + pq.peek().name);
	}
}
