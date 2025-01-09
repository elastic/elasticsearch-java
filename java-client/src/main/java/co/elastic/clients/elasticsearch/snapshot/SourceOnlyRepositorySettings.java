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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: snapshot._types.SourceOnlyRepositorySettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.SourceOnlyRepositorySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class SourceOnlyRepositorySettings extends RepositorySettingsBase {
	@Nullable
	private final String delegateType;

	@Nullable
	private final Integer maxNumberOfSnapshots;

	@Nullable
	private final Boolean readOnly;

	// ---------------------------------------------------------------------------------------------

	private SourceOnlyRepositorySettings(Builder builder) {
		super(builder);

		this.delegateType = builder.delegateType;
		this.maxNumberOfSnapshots = builder.maxNumberOfSnapshots;
		this.readOnly = builder.readOnly;

	}

	public static SourceOnlyRepositorySettings of(Function<Builder, ObjectBuilder<SourceOnlyRepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The delegated repository type. For valid values, refer to the
	 * <code>type</code> parameter. Source repositories can use
	 * <code>settings</code> properties for its delegated repository type.
	 * <p>
	 * API name: {@code delegate_type}
	 */
	@Nullable
	public final String delegateType() {
		return this.delegateType;
	}

	/**
	 * The maximum number of snapshots the repository can contain. The default is
	 * <code>Integer.MAX_VALUE</code>, which is 2^31-1 or <code>2147483647</code>.
	 * <p>
	 * API name: {@code max_number_of_snapshots}
	 */
	@Nullable
	public final Integer maxNumberOfSnapshots() {
		return this.maxNumberOfSnapshots;
	}

	/**
	 * If <code>true</code>, the repository is read-only. The cluster can retrieve
	 * and restore snapshots from the repository but not write to the repository or
	 * create snapshots in it.
	 * <p>
	 * Only a cluster with write access can create snapshots in the repository. All
	 * other clusters connected to the repository should have the
	 * <code>readonly</code> parameter set to <code>true</code>.
	 * <p>
	 * If <code>false</code>, the cluster can write to the repository and create
	 * snapshots in it.
	 * <p>
	 * IMPORTANT: If you register the same snapshot repository with multiple
	 * clusters, only one cluster should have write access to the repository. Having
	 * multiple clusters write to the repository at the same time risks corrupting
	 * the contents of the repository.
	 * <p>
	 * API name: {@code read_only}
	 */
	@Nullable
	public final Boolean readOnly() {
		return this.readOnly;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.delegateType != null) {
			generator.writeKey("delegate_type");
			generator.write(this.delegateType);

		}
		if (this.maxNumberOfSnapshots != null) {
			generator.writeKey("max_number_of_snapshots");
			generator.write(this.maxNumberOfSnapshots);

		}
		if (this.readOnly != null) {
			generator.writeKey("read_only");
			generator.write(this.readOnly);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SourceOnlyRepositorySettings}.
	 */

	public static class Builder extends RepositorySettingsBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SourceOnlyRepositorySettings> {
		@Nullable
		private String delegateType;

		@Nullable
		private Integer maxNumberOfSnapshots;

		@Nullable
		private Boolean readOnly;

		/**
		 * The delegated repository type. For valid values, refer to the
		 * <code>type</code> parameter. Source repositories can use
		 * <code>settings</code> properties for its delegated repository type.
		 * <p>
		 * API name: {@code delegate_type}
		 */
		public final Builder delegateType(@Nullable String value) {
			this.delegateType = value;
			return this;
		}

		/**
		 * The maximum number of snapshots the repository can contain. The default is
		 * <code>Integer.MAX_VALUE</code>, which is 2^31-1 or <code>2147483647</code>.
		 * <p>
		 * API name: {@code max_number_of_snapshots}
		 */
		public final Builder maxNumberOfSnapshots(@Nullable Integer value) {
			this.maxNumberOfSnapshots = value;
			return this;
		}

		/**
		 * If <code>true</code>, the repository is read-only. The cluster can retrieve
		 * and restore snapshots from the repository but not write to the repository or
		 * create snapshots in it.
		 * <p>
		 * Only a cluster with write access can create snapshots in the repository. All
		 * other clusters connected to the repository should have the
		 * <code>readonly</code> parameter set to <code>true</code>.
		 * <p>
		 * If <code>false</code>, the cluster can write to the repository and create
		 * snapshots in it.
		 * <p>
		 * IMPORTANT: If you register the same snapshot repository with multiple
		 * clusters, only one cluster should have write access to the repository. Having
		 * multiple clusters write to the repository at the same time risks corrupting
		 * the contents of the repository.
		 * <p>
		 * API name: {@code read_only}
		 */
		public final Builder readOnly(@Nullable Boolean value) {
			this.readOnly = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SourceOnlyRepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SourceOnlyRepositorySettings build() {
			_checkSingleUse();

			return new SourceOnlyRepositorySettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SourceOnlyRepositorySettings}
	 */
	public static final JsonpDeserializer<SourceOnlyRepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SourceOnlyRepositorySettings::setupSourceOnlyRepositorySettingsDeserializer);

	protected static void setupSourceOnlyRepositorySettingsDeserializer(
			ObjectDeserializer<SourceOnlyRepositorySettings.Builder> op) {
		RepositorySettingsBase.setupRepositorySettingsBaseDeserializer(op);
		op.add(Builder::delegateType, JsonpDeserializer.stringDeserializer(), "delegate_type");
		op.add(Builder::maxNumberOfSnapshots, JsonpDeserializer.integerDeserializer(), "max_number_of_snapshots");
		op.add(Builder::readOnly, JsonpDeserializer.booleanDeserializer(), "read_only", "readonly");

	}

}
