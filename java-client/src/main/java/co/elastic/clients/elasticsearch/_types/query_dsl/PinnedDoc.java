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

package co.elastic.clients.elasticsearch._types.query_dsl;

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

// typedef: _types.query_dsl.PinnedDoc

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.PinnedDoc">API
 *      specification</a>
 */
@JsonpDeserializable
public class PinnedDoc implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String index;

	// ---------------------------------------------------------------------------------------------

	private PinnedDoc(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = builder.index;

	}

	public static PinnedDoc of(Function<Builder, ObjectBuilder<PinnedDoc>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique document ID.
	 * <p>
	 * API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * The index that contains the document.
	 * <p>
	 * API name: {@code _index}
	 */
	@Nullable
	public final String index() {
		return this.index;
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

		generator.writeKey("_id");
		generator.write(this.id);

		if (this.index != null) {
			generator.writeKey("_index");
			generator.write(this.index);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PinnedDoc}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PinnedDoc> {
		private String id;

		@Nullable
		private String index;

		/**
		 * Required - The unique document ID.
		 * <p>
		 * API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The index that contains the document.
		 * <p>
		 * API name: {@code _index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PinnedDoc}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PinnedDoc build() {
			_checkSingleUse();

			return new PinnedDoc(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PinnedDoc}
	 */
	public static final JsonpDeserializer<PinnedDoc> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PinnedDoc::setupPinnedDocDeserializer);

	protected static void setupPinnedDocDeserializer(ObjectDeserializer<PinnedDoc.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");

	}

}
