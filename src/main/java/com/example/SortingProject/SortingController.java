package com.example.SortingProject;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sort")
@CrossOrigin(origins = "*")
public class SortingController {
    private final SortingService sortingService;

    public SortingController(SortingService sortingService) {
        this.sortingService = sortingService;
    }

    @PostMapping("/quick")
    public int[] quickSort(@RequestBody int[] arr) {
        return sortingService.quickSort(arr, 0, arr.length - 1);
    }
}
