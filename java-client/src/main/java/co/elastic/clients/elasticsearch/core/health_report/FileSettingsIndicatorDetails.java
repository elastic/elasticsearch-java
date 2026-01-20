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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: _global.health_report.FileSettingsIndicatorDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.FileSettingsIndicatorDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class FileSettingsIndicatorDetails implements JsonpSerializable {
	private final long failureStreak;

	private final String mostRecentFailure;

	// ---------------------------------------------------------------------------------------------

	private FileSettingsIndicatorDetails(Builder builder) {

		this.failureStreak = ApiTypeHelper.requireNonNull(builder.failureStreak, this, "failureStreak", 0);
		this.mostRecentFailure = ApiTypeHelper.requireNonNull(builder.mostRecentFailure, this, "mostRecentFailure");

	}

	public static FileSettingsIndicatorDetails of(Function<Builder, ObjectBuilder<FileSettingsIndicatorDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code failure_streak}
	 */
	public final long failureStreak() {
		return this.failureStreak;
	}

	/**
	 * Required - API name: {@code most_recent_failure}
	 */
	public final String mostRecentFailure() {
		return this.mostRecentFailure;
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

		generator.writeKey("failure_streak");
		generator.write(this.failureStreak);

		generator.writeKey("most_recent_failure");
		generator.write(this.mostRecentFailure);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FileSettingsIndicatorDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FileSettingsIndicatorDetails> {
		private Long failureStreak;

		private String mostRecentFailure;

		public Builder() {
		}
		private Builder(FileSettingsIndicatorDetails instance) {
			this.failureStreak = instance.failureStreak;
			this.mostRecentFailure = instance.mostRecentFailure;

		}
		/**
		 * Required - API name: {@code failure_streak}
		 */
		public final Builder failureStreak(long value) {
			this.failureStreak = value;
			return this;
		}

		/**
		 * Required - API name: {@code most_recent_failure}
		 */
		public final Builder mostRecentFailure(String value) {
			this.mostRecentFailure = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FileSettingsIndicatorDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FileSettingsIndicatorDetails build() {
			_checkSingleUse();

			return new FileSettingsIndicatorDetails(this);
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
	 * Json deserializer for {@link FileSettingsIndicatorDetails}
	 */
	public static final JsonpDeserializer<FileSettingsIndicatorDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FileSettingsIndicatorDetails::setupFileSettingsIndicatorDetailsDeserializer);

	protected static void setupFileSettingsIndicatorDetailsDeserializer(
			ObjectDeserializer<FileSettingsIndicatorDetails.Builder> op) {

		op.add(Builder::failureStreak, JsonpDeserializer.longDeserializer(), "failure_streak");
		op.add(Builder::mostRecentFailure, JsonpDeserializer.stringDeserializer(), "most_recent_failure");

	}

}
