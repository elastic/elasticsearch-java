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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: _types.SpecifiedDocument

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.SpecifiedDocument">API
 *      specification</a>
 */
@JsonpDeserializable
public class SpecifiedDocument implements JsonpSerializable {
	@Nullable
	private final String index;

	private final String id;

	// ---------------------------------------------------------------------------------------------

	private SpecifiedDocument(Builder builder) {

		this.index = builder.index;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static SpecifiedDocument of(Function<Builder, ObjectBuilder<SpecifiedDocument>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		generator.writeKey("id");
		generator.write(this.id);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpecifiedDocument}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SpecifiedDocument> {
		@Nullable
		private String index;

		private String id;

		public Builder() {
		}
		private Builder(SpecifiedDocument instance) {
			this.index = instance.index;
			this.id = instance.id;

		}
		/**
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SpecifiedDocument}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SpecifiedDocument build() {
			_checkSingleUse();

			return new SpecifiedDocument(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SpecifiedDocument}
	 */
	public static final JsonpDeserializer<SpecifiedDocument> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SpecifiedDocument::setupSpecifiedDocumentDeserializer);

	protected static void setupSpecifiedDocumentDeserializer(ObjectDeserializer<SpecifiedDocument.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");

	}

}
