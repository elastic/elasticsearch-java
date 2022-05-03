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

package co.elastic.clients.elasticsearch.cat.repositories;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.repositories.RepositoriesRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.repositories.RepositoriesRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class RepositoriesRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	private RepositoriesRecord(Builder builder) {

		this.id = builder.id;
		this.type = builder.type;

	}

	public static RepositoriesRecord of(Function<Builder, ObjectBuilder<RepositoriesRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * unique repository id
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * repository type
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoriesRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RepositoriesRecord> {
		@Nullable
		private String id;

		@Nullable
		private String type;

		/**
		 * unique repository id
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * repository type
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RepositoriesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoriesRecord build() {
			_checkSingleUse();

			return new RepositoriesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RepositoriesRecord}
	 */
	public static final JsonpDeserializer<RepositoriesRecord> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RepositoriesRecord::setupRepositoriesRecordDeserializer);

	protected static void setupRepositoriesRecordDeserializer(ObjectDeserializer<RepositoriesRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id", "repoId");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type", "t");

	}

}
