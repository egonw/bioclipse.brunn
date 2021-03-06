 /*******************************************************************************
 * Copyright (c) 2008 The Bioclipse Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ola Spjuth
 *     Stefan Kuhn
 *     Jonathan Alvarsson
 *
 ******************************************************************************/
package net.bioclipse.brunn.business;

import java.util.List;

import net.bioclipse.core.PublishedClass;
import net.bioclipse.core.PublishedMethod;
import net.bioclipse.core.Recorded;
import net.bioclipse.managers.business.IBioclipseManager;

@PublishedClass( "Contains Brunn related methods")
public interface IBrunnManager extends IBioclipseManager {
	
    @Recorded
    @PublishedMethod( methodSummary = "Outputs weehow")
	public String run();

    @Recorded
    @PublishedMethod( methodSummary = "Returns the plate with that barcode")
	public String getPlateByBarcode(String barcode);

    @Recorded
    @PublishedMethod( methodSummary = "Returns all plate barcodes")
    public List<String> getAllPlateBarcodes();
}