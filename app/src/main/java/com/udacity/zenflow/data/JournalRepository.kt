package com.udacity.zenflow.data

import kotlinx.coroutines.flow.Flow

/**
 * Interface defining the contract for data operations.
 *
 * TODO: Feel free to modify this contract if your architectural pattern requires it.
 * For example, if you want to implement a "Search" feature or "Delete" feature,
 * you should define those methods here first.
 */
interface JournalRepository {

    fun getAllEntries(): Flow<List<JournalEntry>>

    suspend fun addEntry(content: String)

    // TODO: This method checks if there is an entry for the day.
    suspend fun hasEntryForToday(): Boolean
}