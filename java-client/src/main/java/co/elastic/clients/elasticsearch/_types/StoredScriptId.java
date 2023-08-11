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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.StoredScriptId

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.StoredScriptId">API
 *      specification</a>
 */
@JsonpDeserializable
public class StoredScriptId extends ScriptBase {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	private StoredScriptId(Builder builder) {
		super(builder);

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static StoredScriptId of(Function<Builder, ObjectBuilder<StoredScriptId>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The <code>id</code> for a stored script.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("id");
		generator.write(this.id);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StoredScriptId}.
	 */

	public static class Builder extends ScriptBase.AbstractBuilder<Builder> implements ObjectBuilder<StoredScriptId> {
		private String id;

		/**
		 * Required - The <code>id</code> for a stored script.
		 * <p>
		 * API name: {@code id}
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
		 * Builds a {@link StoredScriptId}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StoredScriptId build() {
			_checkSingleUse();

			return new StoredScriptId(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StoredScriptId}
	 */
	public static final JsonpDeserializer<StoredScriptId> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StoredScriptId::setupStoredScriptIdDeserializer);

	protected static void setupStoredScriptIdDeserializer(ObjectDeserializer<StoredScriptId.Builder> op) {
		ScriptBase.setupScriptBaseDeserializer(op);
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");

	}

}
