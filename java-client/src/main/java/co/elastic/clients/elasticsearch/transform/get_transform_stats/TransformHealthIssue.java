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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

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
import java.lang.Integer;
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

// typedef: transform.get_transform_stats.TransformHealthIssue

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform_stats.TransformHealthIssue">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformHealthIssue implements JsonpSerializable {
	private final String type;

	private final String issue;

	@Nullable
	private final String details;

	private final int count;

	@Nullable
	private final Long firstOccurrence;

	@Nullable
	private final DateTime firstOccurenceString;

	// ---------------------------------------------------------------------------------------------

	private TransformHealthIssue(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.issue = ApiTypeHelper.requireNonNull(builder.issue, this, "issue");
		this.details = builder.details;
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count", 0);
		this.firstOccurrence = builder.firstOccurrence;
		this.firstOccurenceString = builder.firstOccurenceString;

	}

	public static TransformHealthIssue of(Function<Builder, ObjectBuilder<TransformHealthIssue>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The type of the issue
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - A description of the issue
	 * <p>
	 * API name: {@code issue}
	 */
	public final String issue() {
		return this.issue;
	}

	/**
	 * Details about the issue
	 * <p>
	 * API name: {@code details}
	 */
	@Nullable
	public final String details() {
		return this.details;
	}

	/**
	 * Required - Number of times this issue has occurred since it started
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * The timestamp this issue occurred for for the first time
	 * <p>
	 * API name: {@code first_occurrence}
	 */
	@Nullable
	public final Long firstOccurrence() {
		return this.firstOccurrence;
	}

	/**
	 * API name: {@code first_occurence_string}
	 */
	@Nullable
	public final DateTime firstOccurenceString() {
		return this.firstOccurenceString;
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

		generator.writeKey("issue");
		generator.write(this.issue);

		if (this.details != null) {
			generator.writeKey("details");
			generator.write(this.details);

		}
		generator.writeKey("count");
		generator.write(this.count);

		if (this.firstOccurrence != null) {
			generator.writeKey("first_occurrence");
			generator.write(this.firstOccurrence);

		}
		if (this.firstOccurenceString != null) {
			generator.writeKey("first_occurence_string");
			this.firstOccurenceString.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformHealthIssue}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransformHealthIssue> {
		private String type;

		private String issue;

		@Nullable
		private String details;

		private Integer count;

		@Nullable
		private Long firstOccurrence;

		@Nullable
		private DateTime firstOccurenceString;

		public Builder() {
		}
		private Builder(TransformHealthIssue instance) {
			this.type = instance.type;
			this.issue = instance.issue;
			this.details = instance.details;
			this.count = instance.count;
			this.firstOccurrence = instance.firstOccurrence;
			this.firstOccurenceString = instance.firstOccurenceString;

		}
		/**
		 * Required - The type of the issue
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - A description of the issue
		 * <p>
		 * API name: {@code issue}
		 */
		public final Builder issue(String value) {
			this.issue = value;
			return this;
		}

		/**
		 * Details about the issue
		 * <p>
		 * API name: {@code details}
		 */
		public final Builder details(@Nullable String value) {
			this.details = value;
			return this;
		}

		/**
		 * Required - Number of times this issue has occurred since it started
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * The timestamp this issue occurred for for the first time
		 * <p>
		 * API name: {@code first_occurrence}
		 */
		public final Builder firstOccurrence(@Nullable Long value) {
			this.firstOccurrence = value;
			return this;
		}

		/**
		 * API name: {@code first_occurence_string}
		 */
		public final Builder firstOccurenceString(@Nullable DateTime value) {
			this.firstOccurenceString = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformHealthIssue}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformHealthIssue build() {
			_checkSingleUse();

			return new TransformHealthIssue(this);
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
	 * Json deserializer for {@link TransformHealthIssue}
	 */
	public static final JsonpDeserializer<TransformHealthIssue> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransformHealthIssue::setupTransformHealthIssueDeserializer);

	protected static void setupTransformHealthIssueDeserializer(ObjectDeserializer<TransformHealthIssue.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::issue, JsonpDeserializer.stringDeserializer(), "issue");
		op.add(Builder::details, JsonpDeserializer.stringDeserializer(), "details");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::firstOccurrence, JsonpDeserializer.longDeserializer(), "first_occurrence");
		op.add(Builder::firstOccurenceString, DateTime._DESERIALIZER, "first_occurence_string");

	}

}
