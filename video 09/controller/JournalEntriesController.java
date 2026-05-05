package com.dheeraj.Journal.controller;

import com.dheeraj.Journal.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntriesController {
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntryById(@PathVariable Long myid){
        return journalEntries.get(myid);
    }

    @DeleteMapping("id/{myid}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myid){
        return journalEntries.remove(myid);
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntry(@PathVariable Long id, @RequestBody JournalEntry myEntry){
        return journalEntries.put(id, myEntry);
    }
}
