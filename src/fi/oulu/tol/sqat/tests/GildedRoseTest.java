package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

	//@Test
	//public void testTheTruth() {
	//	assertTrue(true);
	//}
	@Test
	public void Dexterity() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		
		inn.oneDay();
		
	
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 19, quality);
	}
	
	@Test
	public void AgedBrie() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int sellin = items.get(0).getSellIn();
		int quality = items.get(0).getQuality();
		assertEquals(1, quality);
		assertEquals(1, sellin);
		
		inn.oneDay();
		inn.oneDay();
		quality = items.get(0).getQuality();
		sellin = items.get(0).getSellIn();
		assertEquals(4, quality);
		assertEquals(-1, sellin);
		
		
	}
	@Test
	public void mongoose() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 5, 7));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int sellin = items.get(0).getSellIn();
		int quality = items.get(0).getQuality();
		assertEquals(6, quality);
		assertEquals(4, sellin);
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		quality = items.get(0).getQuality();
		sellin = items.get(0).getSellIn();
		assertEquals(0, quality);
		assertEquals(-1, sellin);
	}
	@Test
	public void sulfuras() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int sellin = items.get(0).getSellIn();
		int quality = items.get(0).getQuality();
		assertEquals(80, quality);
		assertEquals(0, sellin);
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		quality = items.get(0).getQuality();
		sellin = items.get(0).getSellIn();
		assertEquals(80, quality);
		assertEquals(0, sellin);
	}
	@Test
	public void backstage() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int sellin = items.get(0).getSellIn();
		int quality = items.get(0).getQuality();
		assertEquals(21, quality);
		assertEquals(10, sellin);
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		quality = items.get(0).getQuality();
		sellin = items.get(0).getSellIn();
		assertEquals(37, quality);
		assertEquals(3, sellin);
		
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		quality = items.get(0).getQuality();
		sellin = items.get(0).getSellIn();
		assertEquals(0, quality);
		assertEquals(-1, sellin);
	}
	

//	@Test
//	public void testmain() {
//		GildedRose inn = new GildedRose();
//        List<Item> items = new ArrayList<Item>();
//        items.add(new Item("+5 Dexterity Vest", 10, 20));
//        items.add(new Item("Aged Brie", 2, 0));
//        items.add(new Item("Elixir of the Mongoose", 5, 7));
//        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
//        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
//        items.add(new Item("Conjured Mana Cake", 3, 6));
//
//        inn.updateQuality();
//		
//	}
}
