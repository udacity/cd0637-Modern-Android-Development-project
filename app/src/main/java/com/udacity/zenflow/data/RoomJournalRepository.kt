package com.udacity.zenflow.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RoomJournalRepository @Inject constructor(
    private val journalDao: JournalDao
) : JournalRepository {

    override fun getAllEntries(): Flow<List<JournalEntry>> {
        // TODO: Hook up the DAO.
        TODO("Not yet implemented")
    }

    override suspend fun addEntry(content: String) {
        // TODO: Create the entity and save it using the DAO.
        // Considerations:
        // - Do you need to validate the content string (e.g. check for empty)?
        // - How do you handle the timestamp?
        TODO("Not yet implemented")
    }

    override suspend fun hasEntryForToday(): Boolean {
        // TODO: Implement the business logic to check if an entry exists for "Today".
        // 1. Calculate the start and end timestamps for the current day.
        //    (Hint: You can use java.util.Calendar, java.time.*, or any other method you prefer).
        // 2. Delegate the checking to the DAO.
        TODO("Not yet implemented")
    }
}