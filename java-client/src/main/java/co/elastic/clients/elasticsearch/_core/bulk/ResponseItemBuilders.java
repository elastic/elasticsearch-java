/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._core.bulk;

/**
 * Builders for {@link ResponseItem} variants.
 */
public class ResponseItemBuilders {
	private ResponseItemBuilders() {
	}

	/**
	 * Creates a builder for the {@link IndexResponseItem index}
	 * {@code ResponseItem} variant.
	 */
	public static IndexResponseItem.Builder index() {
		return new IndexResponseItem.Builder();
	}

	/**
	 * Creates a builder for the {@link CreateResponseItem create}
	 * {@code ResponseItem} variant.
	 */
	public static CreateResponseItem.Builder create() {
		return new CreateResponseItem.Builder();
	}

	/**
	 * Creates a builder for the {@link UpdateResponseItem update}
	 * {@code ResponseItem} variant.
	 */
	public static UpdateResponseItem.Builder update() {
		return new UpdateResponseItem.Builder();
	}

	/**
	 * Creates a builder for the {@link DeleteResponseItem delete}
	 * {@code ResponseItem} variant.
	 */
	public static DeleteResponseItem.Builder delete() {
		return new DeleteResponseItem.Builder();
	}

}
