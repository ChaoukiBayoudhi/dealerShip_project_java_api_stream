//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Integer> list = Arrays.asList(5, 18, 6, 11, 3, 4, 5, 6, 18, 6, 5);
    //or
    List<Integer> lst1 = List.of(5, 18, 6, 11, 3, 4, 5, 6, 18, 6, 5);
    //get a list of the even numbers in the list lst1
    List<Integer> evenNumbers=lst1.stream()
            .filter(x->x%2==0)
            //.collect(Collectors.toList())
            .toList();
    //get the cube of even numbers
    List<Integer> cubeEvenNumbers=lst1.stream()
            .filter(x->x%2==0)
            .map(x->(int)Math.pow(x,3))
            .toList();
    //get the sum of the cube of even numbers
    Integer s =lst1.stream()
            .filter(x->x%2==0)
            .map(x->(int)Math.pow(x,3))
            //.reduce(0,(x,y)->x+y);
            //or
            .reduce(0,Integer::sum);

    System.out.println(s);

    //get a map containing as key a value from the list
    //and as value the number of times it appears in the list
    //the result will be as :
    //5:3
    //18:2
    //6:3
    //11:1
    Map<Integer,Long> nbTimesMap=lst1.stream()
            .collect(Collectors.groupingBy(x->x,
                            Collectors.counting())
            );
    //print the map using forEach
    nbTimesMap.forEach((k,v)->System.out.println(k+" : "+v));
    //using EntrySet:
    for(Map.Entry<Integer,Long> entry:nbTimesMap.entrySet()){
        IO.println(entry.getKey()+" : "+entry.getValue());
    }

}

