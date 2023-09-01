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

// typedef: _types.query_dsl.FieldLookup

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.FieldLookup">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldLookup implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String index;

	@Nullable
	private final String path;

	@Nullable
	private final String routing;

	// ---------------------------------------------------------------------------------------------

	private FieldLookup(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = builder.index;
		this.path = builder.path;
		this.routing = builder.routing;

	}

	public static FieldLookup of(Function<Builder, ObjectBuilder<FieldLookup>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - <code>id</code> of the document.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Index from which to retrieve the document.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * Name of the field.
	 * <p>
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	/**
	 * Custom routing value.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
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

		generator.writeKey("id");
		generator.write(this.id);

		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			generator.write(this.routing);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldLookup}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldLookup> {
		private String id;

		@Nullable
		private String index;

		@Nullable
		private String path;

		@Nullable
		private String routing;

		/**
		 * Required - <code>id</code> of the document.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Index from which to retrieve the document.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * Name of the field.
		 * <p>
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		/**
		 * Custom routing value.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldLookup}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldLookup build() {
			_checkSingleUse();

			return new FieldLookup(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldLookup}
	 */
	public static final JsonpDeserializer<FieldLookup> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldLookup::setupFieldLookupDeserializer);

	protected static void setupFieldLookupDeserializer(ObjectDeserializer<FieldLookup.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");

	}

}
