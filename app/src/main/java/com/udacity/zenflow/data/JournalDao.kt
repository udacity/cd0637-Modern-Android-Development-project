package com.udacity.zenflow.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface JournalDao {

    // TODO: Write the SQL query to retrieve entries.
    // Challenge:
    // - Ensure the sorting makes sense for a journal (e.g., Newest vs Oldest), be creative!
    // - Consider if you need to limit the result set for performance.
    @Query("SELECT * FROM journal_entries") // Placeholder: Update this SQL!
    fun getAllEntries(): Flow<List<JournalEntry>>

    @Insert
    suspend fun insertEntry(entry: JournalEntry)

    // TODO: Create a query to check for existing entries within a time range.
    // This is required to know if users have added an entry on the within a time range.
    // You need to write the @Query annotation that returns a Boolean.
    // @Query("...")
    suspend fun hasEntryBetween(startTime: Long, endTime: Long): Boolean
}