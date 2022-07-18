package MethodsExercise;

import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputAsArray = scanner.nextLine().split("\\s+");
        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "exchange":
                    inputAsArray = getNewArray(inputAsArray, tokens[1]);
                    break;
                case "max":
                    if (tokens[1].equals("even")) {
                        getMaxEven(inputAsArray);
                    } else {
                        getMaxOdd(inputAsArray);
                    }
                    break;
                case "min":
                    if (tokens[1].equals("even")) {
                        getMinEven(inputAsArray);
                    } else {
                        getMinOdd(inputAsArray);
                    }
                    break;
                case "first":
                    if (tokens[2].equals("even")) {
                        findFirstEven(inputAsArray, tokens[1]);
                    } else {
                        findFirstOdd(inputAsArray, tokens[1]);
                    }
                    break;
                case "last":
                    if (tokens[2].equals("even")) {
                        findLastEven(inputAsArray, tokens[1]);
                    } else {
                        findLastOdd(inputAsArray, tokens[1]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (i == inputAsArray.length - 1) {
                System.out.print(inputAsArray[i]);
            } else {
                System.out.print(inputAsArray[i] + ", ");
            }
        }
        System.out.println("]");
    }


    private static void findLastOdd(String[] inputAsArray, String token) {
        int neededCount = Integer.parseInt(token);
        if (neededCount > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = inputAsArray.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                int[] reversedArray = new int[array.length];
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    reversedArray[i] = array[array.length - (i + 1)];
                }

                System.out.print("[");
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    if (i == reversedArray.length - 1) {
                        System.out.print(reversedArray[i]);
                    } else {
                        System.out.print(reversedArray[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }


    private static void findLastEven(String[] inputAsArray, String token) {
        int neededCount = Integer.parseInt(token);
        if (neededCount > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = inputAsArray.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                int[] reversedArray = new int[array.length];
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    reversedArray[i] = array[array.length - (i + 1)];
                }

                System.out.print("[");
                for (int i = 0; i <= reversedArray.length - 1; i++) {
                    if (i == reversedArray.length - 1) {
                        System.out.print(reversedArray[i]);
                    } else {
                        System.out.print(reversedArray[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }


    private static void findFirstOdd(String[] inputAsArray, String token) {
        int neededCount = Integer.parseInt(token);
        if (neededCount > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countOdd = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                    countOdd++;
                }
            }
            int[] array = new int[Math.min(countOdd, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = 0; i <= inputAsArray.length - 1; i++) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                System.out.print("[");
                for (int i = 0; i <= array.length - 1; i++) {
                    if (i == array.length - 1) {
                        System.out.print(array[i]);
                    } else {
                        System.out.print(array[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }


    private static void findFirstEven(String[] inputAsArray, String token) {
        int neededCount = Integer.parseInt(token);
        if (neededCount > inputAsArray.length) {
            System.out.println("Invalid count");
        } else {
            int countEven = 0;
            for (int i = 0; i <= inputAsArray.length - 1; i++) {
                if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                    countEven++;
                }
            }
            int[] array = new int[Math.min(countEven, neededCount)];
            if (array.length > 0) {
                int index = 0;
                for (int i = 0; i <= inputAsArray.length - 1; i++) {
                    if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                        array[index] = Integer.parseInt(inputAsArray[i]);
                        index++;
                        if (index > array.length - 1) {
                            break;
                        }
                    }
                }
                System.out.print("[");
                for (int i = 0; i <= array.length - 1; i++) {
                    if (i == array.length - 1) {
                        System.out.print(array[i]);
                    } else {
                        System.out.print(array[i] + ", ");
                    }
                }
                System.out.println("]");
            } else {
                System.out.println("[]");
            }
        }
    }

    private static void getMinOdd(String[] inputAsArray) {
        int minElement = Integer.MAX_VALUE;
        int indexOfMinElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                if (Integer.parseInt(inputAsArray[i]) <= minElement) {
                    minElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMinElement = i;
                }
            }
        }
        if (indexOfMinElement > -1) {
            System.out.println(indexOfMinElement);
        } else {
            System.out.println("No matches");
        }
    }

    private static void getMinEven(String[] inputAsArray) {
        int minElement = Integer.MAX_VALUE;
        int indexOfMinElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                if (Integer.parseInt(inputAsArray[i]) <= minElement) {
                    minElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMinElement = i;
                }
            }
        }
        if (indexOfMinElement > -1) {
            System.out.println(indexOfMinElement);
        } else {
            System.out.println("No matches");
        }
    }

    private static void getMaxEven(String[] inputAsArray) {
        int maxElement = Integer.MIN_VALUE;
        int indexOfMaxElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 == 0) {
                if (Integer.parseInt(inputAsArray[i]) >= maxElement) {
                    maxElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMaxElement = i;
                }
            }
        }
        if (indexOfMaxElement > -1) {
            System.out.println(indexOfMaxElement);
        } else {
            System.out.println("No matches");
        }
    }

    private static void getMaxOdd(String[] inputAsArray) {
        int maxElement = Integer.MIN_VALUE;
        int indexOfMaxElement = -1;
        for (int i = 0; i <= inputAsArray.length - 1; i++) {
            if (Integer.parseInt(inputAsArray[i]) % 2 != 0) {
                if (Integer.parseInt(inputAsArray[i]) >= maxElement) {
                    maxElement = Integer.parseInt(inputAsArray[i]);
                    indexOfMaxElement = i;
                }
            }
        }
        if (indexOfMaxElement > -1) {
            System.out.println(indexOfMaxElement);
        } else {
            System.out.println("No matches");
        }
    }


    private static String[] getNewArray(String[] inputAsArray, String token) {
        int index = Integer.parseInt(token);
        String[] newArray = new String[inputAsArray.length];
        if (index < 0 || index >= inputAsArray.length) {
            System.out.println("Invalid index");
            return inputAsArray;
        } else {
            int x = 0;
            for (int newStart = index + 1; newStart < inputAsArray.length; newStart++) {
                newArray[x] = inputAsArray[newStart];
                x++;
            }
            for (int newEnd = 0; newEnd <= index; newEnd++) {
                newArray[x] = inputAsArray[newEnd];
                x++;
            }

        }
        return newArray;
    }
}

