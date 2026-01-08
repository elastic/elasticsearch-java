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
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
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

// typedef: nodes._types.NodeReloadResult

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.NodeReloadResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeReloadResult implements JsonpSerializable {
	private final String name;

	@Nullable
	private final ErrorCause reloadException;

	private final List<String> secureSettingNames;

	@Nullable
	private final String keystorePath;

	@Nullable
	private final String keystoreDigest;

	@Nullable
	private final DateTime keystoreLastModifiedTime;

	// ---------------------------------------------------------------------------------------------

	private NodeReloadResult(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.reloadException = builder.reloadException;
		this.secureSettingNames = ApiTypeHelper.unmodifiable(builder.secureSettingNames);
		this.keystorePath = builder.keystorePath;
		this.keystoreDigest = builder.keystoreDigest;
		this.keystoreLastModifiedTime = builder.keystoreLastModifiedTime;

	}

	public static NodeReloadResult of(Function<Builder, ObjectBuilder<NodeReloadResult>> fn) {
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
	 * The names of the secure settings that were reloaded.
	 * <p>
	 * API name: {@code secure_setting_names}
	 */
	public final List<String> secureSettingNames() {
		return this.secureSettingNames;
	}

	/**
	 * The path to the keystore file.
	 * <p>
	 * API name: {@code keystore_path}
	 */
	@Nullable
	public final String keystorePath() {
		return this.keystorePath;
	}

	/**
	 * A SHA-256 hash of the keystore file contents.
	 * <p>
	 * API name: {@code keystore_digest}
	 */
	@Nullable
	public final String keystoreDigest() {
		return this.keystoreDigest;
	}

	/**
	 * The last modification time of the keystore file.
	 * <p>
	 * API name: {@code keystore_last_modified_time}
	 */
	@Nullable
	public final DateTime keystoreLastModifiedTime() {
		return this.keystoreLastModifiedTime;
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
		if (ApiTypeHelper.isDefined(this.secureSettingNames)) {
			generator.writeKey("secure_setting_names");
			generator.writeStartArray();
			for (String item0 : this.secureSettingNames) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.keystorePath != null) {
			generator.writeKey("keystore_path");
			generator.write(this.keystorePath);

		}
		if (this.keystoreDigest != null) {
			generator.writeKey("keystore_digest");
			generator.write(this.keystoreDigest);

		}
		if (this.keystoreLastModifiedTime != null) {
			generator.writeKey("keystore_last_modified_time");
			this.keystoreLastModifiedTime.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeReloadResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeReloadResult> {
		private String name;

		@Nullable
		private ErrorCause reloadException;

		@Nullable
		private List<String> secureSettingNames;

		@Nullable
		private String keystorePath;

		@Nullable
		private String keystoreDigest;

		@Nullable
		private DateTime keystoreLastModifiedTime;

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

		/**
		 * The names of the secure settings that were reloaded.
		 * <p>
		 * API name: {@code secure_setting_names}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>secureSettingNames</code>.
		 */
		public final Builder secureSettingNames(List<String> list) {
			this.secureSettingNames = _listAddAll(this.secureSettingNames, list);
			return this;
		}

		/**
		 * The names of the secure settings that were reloaded.
		 * <p>
		 * API name: {@code secure_setting_names}
		 * <p>
		 * Adds one or more values to <code>secureSettingNames</code>.
		 */
		public final Builder secureSettingNames(String value, String... values) {
			this.secureSettingNames = _listAdd(this.secureSettingNames, value, values);
			return this;
		}

		/**
		 * The path to the keystore file.
		 * <p>
		 * API name: {@code keystore_path}
		 */
		public final Builder keystorePath(@Nullable String value) {
			this.keystorePath = value;
			return this;
		}

		/**
		 * A SHA-256 hash of the keystore file contents.
		 * <p>
		 * API name: {@code keystore_digest}
		 */
		public final Builder keystoreDigest(@Nullable String value) {
			this.keystoreDigest = value;
			return this;
		}

		/**
		 * The last modification time of the keystore file.
		 * <p>
		 * API name: {@code keystore_last_modified_time}
		 */
		public final Builder keystoreLastModifiedTime(@Nullable DateTime value) {
			this.keystoreLastModifiedTime = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeReloadResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeReloadResult build() {
			_checkSingleUse();

			return new NodeReloadResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeReloadResult}
	 */
	public static final JsonpDeserializer<NodeReloadResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeReloadResult::setupNodeReloadResultDeserializer);

	protected static void setupNodeReloadResultDeserializer(ObjectDeserializer<NodeReloadResult.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::reloadException, ErrorCause._DESERIALIZER, "reload_exception");
		op.add(Builder::secureSettingNames, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"secure_setting_names");
		op.add(Builder::keystorePath, JsonpDeserializer.stringDeserializer(), "keystore_path");
		op.add(Builder::keystoreDigest, JsonpDeserializer.stringDeserializer(), "keystore_digest");
		op.add(Builder::keystoreLastModifiedTime, DateTime._DESERIALIZER, "keystore_last_modified_time");

	}

}
