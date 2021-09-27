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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.mapping.DocValuesPropertyBase

public abstract class DocValuesPropertyBase extends CorePropertyBase {
	@Nullable
	private final Boolean docValues;

	// ---------------------------------------------------------------------------------------------

	public DocValuesPropertyBase(AbstractBuilder<?> builder) {
		super(builder);

		this.docValues = builder.docValues;

	}

	/**
	 * API name: {@code doc_values}
	 */
	@Nullable
	public Boolean docValues() {
		return this.docValues;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.docValues != null) {

			generator.writeKey("doc_values");
			generator.write(this.docValues);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				CorePropertyBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Boolean docValues;

		/**
		 * API name: {@code doc_values}
		 */
		public BuilderT docValues(@Nullable Boolean value) {
			this.docValues = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDocValuesPropertyBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		CorePropertyBase.setupCorePropertyBaseDeserializer(op);
		op.add(AbstractBuilder::docValues, JsonpDeserializer.booleanDeserializer(), "doc_values");

	}

}
