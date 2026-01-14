package com.udacity.zenflow.ui.journal

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun JournalScreen(
    viewModel: JournalViewModel = hiltViewModel()
) {
    // TODO: Collect the entries state from the ViewModel
    // val entries by ...

    Box(modifier = Modifier.fillMaxSize()) {
        // TODO: Build the Journal UI.

        // Requirements:
        // 1. INPUT AREA:
        //    - A text field for the user to type their gratitude entry.
        //    - A button to save the entry (calls viewModel.addEntry).

        // 2. LIST AREA:
        //    - Display the list of past entries.
        //    - Use a LazyColumn or LazyRow for performance.
        //    - Create a custom Composable (e.g., JournalEntryCard) to display each item.

        // Design Decision:
        // Do you want the input at the top or the bottom?
        // Do you want to separate the list by Date? (Advanced challenge)
    }
}

// TODO: Create a Composable to render a single Journal Entry.
// @Composable
// fun JournalEntryCard(...) { ... }