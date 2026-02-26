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

package co.elastic.clients.elasticsearch.core.health_report;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _global.health_report.FileSettingsIndicator

/**
 * FILE_SETTINGS
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.FileSettingsIndicator">API
 *      specification</a>
 */
@JsonpDeserializable
public class FileSettingsIndicator extends BaseIndicator {
	@Nullable
	private final FileSettingsIndicatorDetails details;

	// ---------------------------------------------------------------------------------------------

	private FileSettingsIndicator(Builder builder) {
		super(builder);

		this.details = builder.details;

	}

	public static FileSettingsIndicator of(Function<Builder, ObjectBuilder<FileSettingsIndicator>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code details}
	 */
	@Nullable
	public final FileSettingsIndicatorDetails details() {
		return this.details;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.details != null) {
			generator.writeKey("details");
			this.details.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileSettingsIndicator}.
	 */

	public static class Builder extends BaseIndicator.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FileSettingsIndicator> {
		@Nullable
		private FileSettingsIndicatorDetails details;

		public Builder() {
		}
		private Builder(FileSettingsIndicator instance) {
			this.details = instance.details;

		}
		/**
		 * API name: {@code details}
		 */
		public final Builder details(@Nullable FileSettingsIndicatorDetails value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public final Builder details(
				Function<FileSettingsIndicatorDetails.Builder, ObjectBuilder<FileSettingsIndicatorDetails>> fn) {
			return this.details(fn.apply(new FileSettingsIndicatorDetails.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FileSettingsIndicator}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileSettingsIndicator build() {
			_checkSingleUse();

			return new FileSettingsIndicator(this);
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
	 * Json deserializer for {@link FileSettingsIndicator}
	 */
	public static final JsonpDeserializer<FileSettingsIndicator> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FileSettingsIndicator::setupFileSettingsIndicatorDeserializer);

	protected static void setupFileSettingsIndicatorDeserializer(ObjectDeserializer<FileSettingsIndicator.Builder> op) {
		BaseIndicator.setupBaseIndicatorDeserializer(op);
		op.add(Builder::details, FileSettingsIndicatorDetails._DESERIALIZER, "details");

	}

}
