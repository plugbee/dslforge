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

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="df_project")
public class Project extends Folder {
	
	private User user;
	private String visibility;
	
	@ManyToOne
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	public String getVisibility() {
		return visibility;
	}
	
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + getId()+ 
				"\n\t, name=" + getName() + 
				"\n\t, description=" + getDescription() + 
				"\n\t, path=" + getPath() + 
				"\n\t, user=" + getUser() + 
				"\n\t, visibility=" + visibility + 
				"\n]";
	}
}
