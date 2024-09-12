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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: ingest._types.UserAgentProcessor

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest._types.UserAgentProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class UserAgentProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final String regexFile;

	@Nullable
	private final String targetField;

	private final List<UserAgentProperty> properties;

	@Nullable
	private final Boolean extractDeviceType;

	// ---------------------------------------------------------------------------------------------

	private UserAgentProcessor(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.regexFile = builder.regexFile;
		this.targetField = builder.targetField;
		this.properties = ApiTypeHelper.unmodifiable(builder.properties);
		this.extractDeviceType = builder.extractDeviceType;

	}

	public static UserAgentProcessor of(Function<Builder, ObjectBuilder<UserAgentProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.UserAgent;
	}

	/**
	 * Required - The field containing the user agent string.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * If <code>true</code> and <code>field</code> does not exist, the processor
	 * quietly exits without modifying the document.
	 * <p>
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * The name of the file in the <code>config/ingest-user-agent</code> directory
	 * containing the regular expressions for parsing the user agent string. Both
	 * the directory and the file have to be created before starting Elasticsearch.
	 * If not specified, ingest-user-agent will use the <code>regexes.yaml</code>
	 * from uap-core it ships with.
	 * <p>
	 * API name: {@code regex_file}
	 */
	@Nullable
	public final String regexFile() {
		return this.regexFile;
	}

	/**
	 * The field that will be filled with the user agent details.
	 * <p>
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	/**
	 * Controls what properties are added to <code>target_field</code>.
	 * <p>
	 * API name: {@code properties}
	 */
	public final List<UserAgentProperty> properties() {
		return this.properties;
	}

	/**
	 * Extracts device type from the user agent string on a best-effort basis.
	 * <p>
	 * API name: {@code extract_device_type}
	 */
	@Nullable
	public final Boolean extractDeviceType() {
		return this.extractDeviceType;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (this.regexFile != null) {
			generator.writeKey("regex_file");
			generator.write(this.regexFile);

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}
		if (ApiTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartArray();
			for (UserAgentProperty item0 : this.properties) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.extractDeviceType != null) {
			generator.writeKey("extract_device_type");
			generator.write(this.extractDeviceType);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserAgentProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UserAgentProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private String regexFile;

		@Nullable
		private String targetField;

		@Nullable
		private List<UserAgentProperty> properties;

		@Nullable
		private Boolean extractDeviceType;

		/**
		 * Required - The field containing the user agent string.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * If <code>true</code> and <code>field</code> does not exist, the processor
		 * quietly exits without modifying the document.
		 * <p>
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * The name of the file in the <code>config/ingest-user-agent</code> directory
		 * containing the regular expressions for parsing the user agent string. Both
		 * the directory and the file have to be created before starting Elasticsearch.
		 * If not specified, ingest-user-agent will use the <code>regexes.yaml</code>
		 * from uap-core it ships with.
		 * <p>
		 * API name: {@code regex_file}
		 */
		public final Builder regexFile(@Nullable String value) {
			this.regexFile = value;
			return this;
		}

		/**
		 * The field that will be filled with the user agent details.
		 * <p>
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
			this.targetField = value;
			return this;
		}

		/**
		 * Controls what properties are added to <code>target_field</code>.
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>properties</code>.
		 */
		public final Builder properties(List<UserAgentProperty> list) {
			this.properties = _listAddAll(this.properties, list);
			return this;
		}

		/**
		 * Controls what properties are added to <code>target_field</code>.
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds one or more values to <code>properties</code>.
		 */
		public final Builder properties(UserAgentProperty value, UserAgentProperty... values) {
			this.properties = _listAdd(this.properties, value, values);
			return this;
		}

		/**
		 * Extracts device type from the user agent string on a best-effort basis.
		 * <p>
		 * API name: {@code extract_device_type}
		 */
		public final Builder extractDeviceType(@Nullable Boolean value) {
			this.extractDeviceType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UserAgentProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserAgentProcessor build() {
			_checkSingleUse();

			return new UserAgentProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserAgentProcessor}
	 */
	public static final JsonpDeserializer<UserAgentProcessor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UserAgentProcessor::setupUserAgentProcessorDeserializer);

	protected static void setupUserAgentProcessorDeserializer(ObjectDeserializer<UserAgentProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::regexFile, JsonpDeserializer.stringDeserializer(), "regex_file");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");
		op.add(Builder::properties, JsonpDeserializer.arrayDeserializer(UserAgentProperty._DESERIALIZER), "properties");
		op.add(Builder::extractDeviceType, JsonpDeserializer.booleanDeserializer(), "extract_device_type");

	}

}
