/*******************************************************************************
 * Copyright (c) 2020 Metron, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Metron, Inc. - initial API and implementation
 *******************************************************************************/

package other.service.api;

import java.util.Optional;
import java.util.ServiceLoader;


public interface IOtherService {

  static Optional<IOtherService> getImpl() {
    return ServiceLoader.load(IOtherService.class).findFirst();
  }

  void doSomething();

}
