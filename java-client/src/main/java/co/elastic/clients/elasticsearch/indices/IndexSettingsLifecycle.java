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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingsLifecycle
@JsonpDeserializable
public class IndexSettingsLifecycle implements JsonpSerializable {
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingsLifecycle(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static IndexSettingsLifecycle of(Function<Builder, ObjectBuilder<IndexSettingsLifecycle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsLifecycle}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexSettingsLifecycle> {
		private String name;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsLifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsLifecycle build() {
			_checkSingleUse();

			return new IndexSettingsLifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSettingsLifecycle}
	 */
	public static final JsonpDeserializer<IndexSettingsLifecycle> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingsLifecycle::setupIndexSettingsLifecycleDeserializer, Builder::build);

	protected static void setupIndexSettingsLifecycleDeserializer(
			DelegatingDeserializer<IndexSettingsLifecycle.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
