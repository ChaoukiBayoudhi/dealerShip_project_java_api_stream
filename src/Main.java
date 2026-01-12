//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    List<Integer> list = Arrays.asList(5, 18, 6, 11, 3, 4, 5, 6, 18, 6, 5);
    //or
    List<Integer> lst1 = List.of(5, 18, 6, 11, 3, 4, 5, 6, 18, 6, 5);
    //get a list of the even numbers in the list
    List<Integer> evenNumbers = lst1.stream()
            .filter(x -> x % 2 == 0)
            //.collect(Collectors.toList());
            .toList();
    IO.println(evenNumbers);

    //get the cube of even numbers
    lst1.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> (int) Math.pow(x, 3))
            //.forEach(x->System.out.println(x))
            .forEach(System.out::println);

    List<Double> cubeEvenNumbers = lst1.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> Math.pow(x, 3))
            .toList();
    IO.println(cubeEvenNumbers);

    //get the sum of the cube of even numbers
    Double s1 = lst1.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> Math.pow(x, 3))
            .reduce(0.0, Double::sum);
    //.reduce(0.0,(x,y)->x+y);
    IO.println(s1);

    //get a map containing as key a value from the list
    //and as value the number of times it appears in the list
    Map<Integer, Long> valuesByTimes = lst1.stream()
            .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    IO.println(valuesByTimes);

    //print the map using forEach
    IO.println("the map (key,value) couple using forEach :");
    valuesByTimes.forEach((k, v) -> IO.println(k + " : " + v));

    //using EntrySet:
    IO.println("the map (key,value) couple using EntrySet");
    for (Map.Entry<Integer, Long> entry:valuesByTimes.entrySet())
        IO.println(entry.getKey()+" : "+entry.getValue());
}

