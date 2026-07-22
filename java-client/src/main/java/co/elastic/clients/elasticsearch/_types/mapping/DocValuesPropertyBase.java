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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: _types.mapping.DocValuesPropertyBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.DocValuesPropertyBase">API
 *      specification</a>
 */

public abstract class DocValuesPropertyBase extends CorePropertyBase {
	@Nullable
	private final DocValues docValues;

	// ---------------------------------------------------------------------------------------------

	protected DocValuesPropertyBase(AbstractBuilder<?> builder) {
		super(builder);

		this.docValues = builder.docValues;

	}

	/**
	 * API name: {@code doc_values}
	 */
	@Nullable
	public final DocValues docValues() {
		return this.docValues;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.docValues != null) {
			generator.writeKey("doc_values");
			this.docValues.serialize(generator, mapper);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				CorePropertyBase.AbstractBuilder<BuilderT> {
		@Nullable
		private DocValues docValues;

		/**
		 * API name: {@code doc_values}
		 */
		public final BuilderT docValues(@Nullable DocValues value) {
			this.docValues = value;
			return self();
		}

		/**
		 * API name: {@code doc_values}
		 */
		public final BuilderT docValues(Function<DocValues.Builder, ObjectBuilder<DocValues>> fn) {
			return this.docValues(fn.apply(new DocValues.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupDocValuesPropertyBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		CorePropertyBase.setupCorePropertyBaseDeserializer(op);
		op.add(AbstractBuilder::docValues, DocValues._DESERIALIZER, "doc_values");

	}

}
