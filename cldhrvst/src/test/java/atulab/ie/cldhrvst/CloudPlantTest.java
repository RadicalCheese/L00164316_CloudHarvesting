package atulab.ie.cldhrvst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CloudPlantTest {

    //CloudPlant object
    CloudPlant cloudPlant = new CloudPlant();

    // Test for getName and setName
    @Test
    public void testGetAndSetName() {
        cloudPlant.setName("Cumulus");
        assertEquals("Cumulus", cloudPlant.getName(), "The name should be set and retrieved correctly.");
    }

    // Test for getColour and setColour
    @Test
    public void testGetAndSetColour() {
        cloudPlant.setColour("White");
        assertEquals("White", cloudPlant.getColour(), "The colour should be set and retrieved correctly.");
    }

    // Test for getPurpose and setPurpose
    @Test
    public void testGetAndSetPurpose() {
        cloudPlant.setPurpose("Rainfall");
        assertEquals("Rainfall", cloudPlant.getPurpose(), "The purpose should be set and retrieved correctly.");
    }

    // Test for getNumClouds and setNumClouds
    @Test
    public void testGetAndSetNumClouds() {
        cloudPlant.setNumClouds(5);
        assertEquals(5, cloudPlant.getNumClouds(), "The number of clouds should be set and retrieved correctly.");
    }

    // Test for setting negative value for numClouds
    @Test
    public void testSetNegativeNumClouds() {
        cloudPlant.setNumClouds(-1);
        assertEquals(-1, cloudPlant.getNumClouds(), "NumClouds should accept a negative value (although may not be logical).");
    }

    // Test for setting empty string for name
    @Test
    public void testSetEmptyName() {
        cloudPlant.setName("");
        assertEquals("", cloudPlant.getName(), "Name should be able to be set to an empty string.");
    }

    // Test for setting null for purpose
    @Test
    public void testSetNullPurpose() {
        cloudPlant.setPurpose(null);
        assertNull(cloudPlant.getPurpose(), "Purpose should be able to be set to null.");
    }

}
