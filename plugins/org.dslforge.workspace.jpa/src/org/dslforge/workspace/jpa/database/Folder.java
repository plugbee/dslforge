/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.dslforge.workspace.jpa.database;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="df_folder")
public class Folder {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String id;
	private String name = null;
	private String description = null;
	private String path = null;
	private List<Resource> resources = new ArrayList<Resource>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	@OneToMany
	public List<Resource> getResources() {
		return resources;
	}
	
	@Override
	public String toString() {
		return "Folder [id=" + id + 
				"\n\t, name=" + name + 
				"\n\t, description=" + description + 
				"\n\t, path=" + path + 
				"\n]";
	}
}
