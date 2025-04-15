package com.example.testingtesting123

import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        collection.addItem(Item("Item1")) // Add an item to the collection
        val item = collection.get(0) // Assuming get(0) returns the first item in the collection
        assert(item.name == "Item1") // Ensure the added item has the correct name
    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        collection.addItem(Item("Item1")) // Add a unique item
        collection.addItem(Item("Item1")) // Try to add the same item again
        collection.addItem(Item("Item2")) // Add a second unique item
        assert(collection.size() == 2) // Ensure only two items are in the collection
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1")) // Add an item to the collection
        collection.addItem(Item("Item2")) // Add another item to the collection

        val originalSize = collection.size() // Get the initial size of the collection
        collection.clear() // Clear all items from the collection
        val newSize = collection.size() // Assuming size() returns the number of items in the collection

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"} // Ensure the collection is empty
    }
}