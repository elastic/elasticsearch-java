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

package co.elastic.clients.elasticsearch.esql;

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

// typedef: esql._types.IdPath

/**
 * The <code>_id</code> meta-field of a dataset mapping.
 * 
 * @see <a href="../doc-files/api-spec.html#esql._types.IdPath">API
 *      specification</a>
 */
@JsonpDeserializable
public class IdPath implements JsonpSerializable {
	private final String path;

	// ---------------------------------------------------------------------------------------------

	private IdPath(Builder builder) {

		this.path = ApiTypeHelper.requireNonNull(builder.path, this, "path");

	}

	public static IdPath of(Function<Builder, ObjectBuilder<IdPath>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the column that provides the document identity.
	 * <p>
	 * API name: {@code path}
	 */
	public final String path() {
		return this.path;
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

		generator.writeKey("path");
		generator.write(this.path);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IdPath}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IdPath> {
		private String path;

		public Builder() {
		}
		private Builder(IdPath instance) {
			this.path = instance.path;

		}
		/**
		 * Required - The name of the column that provides the document identity.
		 * <p>
		 * API name: {@code path}
		 */
		public final Builder path(String value) {
			this.path = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IdPath}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IdPath build() {
			_checkSingleUse();

			return new IdPath(this);
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
	 * Json deserializer for {@link IdPath}
	 */
	public static final JsonpDeserializer<IdPath> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IdPath::setupIdPathDeserializer);

	protected static void setupIdPathDeserializer(ObjectDeserializer<IdPath.Builder> op) {

		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");

	}

}
