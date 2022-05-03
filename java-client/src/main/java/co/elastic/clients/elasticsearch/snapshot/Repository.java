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

package co.elastic.clients.elasticsearch.snapshot;

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

// typedef: snapshot._types.Repository

/**
 *
 * @see <a href="../doc-files/api-spec.html#snapshot._types.Repository">API
 *      specification</a>
 */
@JsonpDeserializable
public class Repository implements JsonpSerializable {
	private final String type;

	@Nullable
	private final String uuid;

	private final RepositorySettings settings;

	// ---------------------------------------------------------------------------------------------

	private Repository(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.uuid = builder.uuid;
		this.settings = ApiTypeHelper.requireNonNull(builder.settings, this, "settings");

	}

	public static Repository of(Function<Builder, ObjectBuilder<Repository>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code uuid}
	 */
	@Nullable
	public final String uuid() {
		return this.uuid;
	}

	/**
	 * Required - API name: {@code settings}
	 */
	public final RepositorySettings settings() {
		return this.settings;
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

		if (this.uuid != null) {
			generator.writeKey("uuid");
			generator.write(this.uuid);

		}
		generator.writeKey("settings");
		this.settings.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Repository}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Repository> {
		private String type;

		@Nullable
		private String uuid;

		private RepositorySettings settings;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code uuid}
		 */
		public final Builder uuid(@Nullable String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(RepositorySettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Required - API name: {@code settings}
		 */
		public final Builder settings(Function<RepositorySettings.Builder, ObjectBuilder<RepositorySettings>> fn) {
			return this.settings(fn.apply(new RepositorySettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Repository}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Repository build() {
			_checkSingleUse();

			return new Repository(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Repository}
	 */
	public static final JsonpDeserializer<Repository> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Repository::setupRepositoryDeserializer);

	protected static void setupRepositoryDeserializer(ObjectDeserializer<Repository.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");
		op.add(Builder::settings, RepositorySettings._DESERIALIZER, "settings");

	}

}
