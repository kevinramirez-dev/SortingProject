🔹 Project Title: Sorting Project (Quick Sort)

A simple sorting web application that sorts numbers using Quick Sort, with a Spring Boot backend and an HTML + JavaScript frontend.
🔹 Features

✅ Quick Sort Algorithm – Efficiently sorts numbers.
✅ Spring Boot Backend – Handles sorting logic.
✅ JavaScript Frontend – Simple UI for user input.
✅ REST API Communication – Frontend sends numbers to backend, backend returns sorted numbers.
🔹 Technologies Used

    Java (Spring Boot) – Handles backend API requests.
    JavaScript (Fetch API) – Connects frontend to backend.
    HTML & CSS – Provides user interface.
    Git & GitHub – Version control.

🔹 How the Project Works

1️⃣ User enters numbers (e.g., 5,3,8,2,1) in the frontend.
2️⃣ Frontend sends numbers to backend (/api/sort/quick).
3️⃣ Backend sorts numbers using Quick Sort and returns them.
4️⃣ Frontend displays sorted numbers.

🔹 Backend: Code Descriptions
1️⃣ SortingService.java (Sorting Logic)

```
@Service
public class SortingService {
    public int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

```

🔹 API Usage

```
curl -X POST http://localhost:8080/api/sort/quick \
     -H "Content-Type: application/json" \
     -d "[5, 3, 8, 2, 1]"
```

🔹 Running the Project


```
cd ~/Desktop/SortingProject
mvn spring-boot:run

```

```
cd ~/Desktop/SortingProject-Frontend
python3 -m http.server 5500

```

🔹 Future Improvements

💡 Add more sorting algorithms (Merge Sort, Bubble Sort, etc.).











