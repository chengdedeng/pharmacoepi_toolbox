/* 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. 
 */
package org.drugepi.match.storage;

import java.util.Comparator;

public class MatchSetTreatmentPatientIdComparator implements Comparator<MatchSet> {
	public int compare(MatchSet o1, MatchSet o2) {
		return o1.getTreatmentPatient().id.compareTo(o2.getTreatmentPatient().id);
	}
}