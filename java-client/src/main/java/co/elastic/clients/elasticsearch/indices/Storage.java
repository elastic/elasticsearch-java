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

package co.elastic.clients.elasticsearch.indices;

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
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.Storage

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.Storage">API
 *      specification</a>
 */
@JsonpDeserializable
public class Storage implements JsonpSerializable {
	private final String type;

	@Nullable
	private final Boolean allowMmap;

	// ---------------------------------------------------------------------------------------------

	private Storage(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.allowMmap = builder.allowMmap;

	}

	public static Storage of(Function<Builder, ObjectBuilder<Storage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * You can restrict the use of the mmapfs and the related hybridfs store type
	 * via the setting node.store.allow_mmap. This is a boolean setting indicating
	 * whether or not memory-mapping is allowed. The default is to allow it. This
	 * setting is useful, for example, if you are in an environment where you can
	 * not control the ability to create a lot of memory maps so you need disable
	 * the ability to use memory-mapping.
	 * <p>
	 * API name: {@code allow_mmap}
	 */
	@Nullable
	public final Boolean allowMmap() {
		return this.allowMmap;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (this.allowMmap != null) {
			generator.writeKey("allow_mmap");
			generator.write(this.allowMmap);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Storage}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Storage> {
		private String type;

		@Nullable
		private Boolean allowMmap;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(StorageType value) {
			this.type = value == null ? null : value.jsonValue();
			return this;
		}

		/**
		 * You can restrict the use of the mmapfs and the related hybridfs store type
		 * via the setting node.store.allow_mmap. This is a boolean setting indicating
		 * whether or not memory-mapping is allowed. The default is to allow it. This
		 * setting is useful, for example, if you are in an environment where you can
		 * not control the ability to create a lot of memory maps so you need disable
		 * the ability to use memory-mapping.
		 * <p>
		 * API name: {@code allow_mmap}
		 */
		public final Builder allowMmap(@Nullable Boolean value) {
			this.allowMmap = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Storage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Storage build() {
			_checkSingleUse();

			return new Storage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Storage}
	 */
	public static final JsonpDeserializer<Storage> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Storage::setupStorageDeserializer);

	protected static void setupStorageDeserializer(ObjectDeserializer<Storage.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::allowMmap, JsonpDeserializer.booleanDeserializer(), "allow_mmap");

	}

}
