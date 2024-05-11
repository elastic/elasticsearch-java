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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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

// typedef: nodes._types.NodeReloadError

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.NodeReloadError">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeReloadError implements JsonpSerializable {
	private final String name;

	@Nullable
	private final ErrorCause reloadException;

	// ---------------------------------------------------------------------------------------------

	private NodeReloadError(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.reloadException = builder.reloadException;

	}

	public static NodeReloadError of(Function<Builder, ObjectBuilder<NodeReloadError>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code reload_exception}
	 */
	@Nullable
	public final ErrorCause reloadException() {
		return this.reloadException;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (this.reloadException != null) {
			generator.writeKey("reload_exception");
			this.reloadException.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeReloadError}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeReloadError> {
		private String name;

		@Nullable
		private ErrorCause reloadException;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code reload_exception}
		 */
		public final Builder reloadException(@Nullable ErrorCause value) {
			this.reloadException = value;
			return this;
		}

		/**
		 * API name: {@code reload_exception}
		 */
		public final Builder reloadException(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.reloadException(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeReloadError}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeReloadError build() {
			_checkSingleUse();

			return new NodeReloadError(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeReloadError}
	 */
	public static final JsonpDeserializer<NodeReloadError> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeReloadError::setupNodeReloadErrorDeserializer);

	protected static void setupNodeReloadErrorDeserializer(ObjectDeserializer<NodeReloadError.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::reloadException, ErrorCause._DESERIALIZER, "reload_exception");

	}

}
